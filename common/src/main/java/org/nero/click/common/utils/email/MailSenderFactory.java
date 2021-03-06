package org.nero.click.common.utils.email;

/**
 * author： nero
 * email: nerosoft@outlook.com
 * data: 16-10-4
 * time: 下午4:30.
 */
public class MailSenderFactory {

    /**
     * 服务邮箱
     */
    private static SimpleMailSender serviceSms = null;

    /**
     * 获取邮箱
     *
     * @param type 邮箱类型
     * @return 符合类型的邮箱
     */
    public static SimpleMailSender getSender(MailSenderType type) {
        if (type == MailSenderType.SERVICE) {
            if (serviceSms == null) {
                serviceSms = new SimpleMailSender("yxf535177134@163.com",
                        "baby520587");
            }
            return serviceSms;
        }
        return null;
    }

}
