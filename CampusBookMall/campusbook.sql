/*
Navicat MySQL Data Transfer

Source Server         : spring  boot
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : campusbook

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2021-06-19 20:01:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `bookId` int(11) NOT NULL,
  `bookImg` varchar(255) DEFAULT NULL,
  `bookName` varchar(30) DEFAULT NULL,
  `bookCategory` varchar(30) DEFAULT NULL COMMENT '1:科技类 2生活类 3文学类',
  `author` varchar(30) DEFAULT NULL,
  `publishingHouse` varchar(50) DEFAULT NULL COMMENT '出版设',
  `printTimes` varchar(50) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `briefIntroduction` text COMMENT '内容简介',
  `price` decimal(10,2) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `publishDate` datetime DEFAULT NULL,
  `bstate` varchar(20) DEFAULT NULL COMMENT '书籍状态1:上架2:下架3：其它',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '123456', 'http://localhost:8091/static/images/xiyouji.jpg', '西游记', '1', '吴承恩', '清华出版社', '初版', '2021-05-24 15:33:19', '西天取经', '50.00', '20', '2002-01-01 17:05:52', '1');
INSERT INTO `book` VALUES ('2', '654455', 'http://localhost:8091/static/images/shuihu.jpg', '水浒传', '1', '施耐庵', '云南出版社', '初版', '2021-05-28 16:17:45', '梁山兄弟', '30.00', '60', '2002-01-01 17:06:05', '1');
INSERT INTO `book` VALUES ('3', '666661', 'http://localhost:8091/static/images/sanguoyanyi.jpg', '三国演义', '1', '罗贯中', '湖南出版社', '初版', '2021-05-31 14:42:00', '桃园结义', '40.00', '80', '2001-08-01 17:06:14', '2');
INSERT INTO `book` VALUES ('4', '879654', 'http://localhost:8091/static/images/honloumeng.jpg', '红楼梦', '1', '曹雪芹', '安徽教育出版社', '初版', '2021-05-31 14:45:00', '中国古典小说的佳作，影响了整个华人世界的经典！ ★经典中的经典，人一生的 四大名著 之一。 ★《红楼梦》，是一部具有高度思想性和高度艺术性的伟大作品，是十八世纪中国伟大的文学巨著，不仅是中国文学之林的珍奇瑰\r\n', '60.00', '100', '2001-08-01 17:06:24', '1');
INSERT INTO `book` VALUES ('5', '648792', 'http://localhost:8091/static/images/santi.jpg', '三体', '1', '刘慈欣', '重庆出版社', '初版', '2021-05-31 14:51:07', '慈欣基于科学事实，用大胆的想象和严谨的推断，在三体星系行星中构建了一个外星文明形态，并描绘了该文明不可捉摸的数百次的毁灭和重生。', '70.00', '120', '1999-10-01 17:06:37', '1');
INSERT INTO `book` VALUES ('6', '789444', 'http://localhost:8091/static/images/gaozhonshuxue.jpg', '高三数学', '[3,6,9]', '张三', '重庆出版社', '初版', '2021-06-16 15:20:44', '数学简单易学', '30.00', '45', '1991-06-16 15:21:18', '1');
INSERT INTO `book` VALUES ('7', '845544', 'http://localhost:8091/static/images/gzyingyu.jpg', '高三英语', '[3,6,9]', '李四', '云南出版社', '初版', '2021-06-16 15:20:44', '英语简单易学', '30.00', '12', '1991-06-16 15:21:18', '1');
INSERT INTO `book` VALUES ('8', '849544', 'http://localhost:8091/static/images/yingyukouyu.jpg', '英语口语', '[3,7,10]', '王五', '天津出版社', '初版', '2021-06-16 15:20:44', '英语口语简单易学', '70.00', '12', '1991-06-16 15:21:18', '1');
INSERT INTO `book` VALUES ('9', '238574', 'http://localhost:8091/static/images/yingyutingli.jpg', '英语听力', '[3,7,11]', '赵六', '贵州出版社', '初版', '2021-06-16 15:20:44', '英语听力简单易学', '90.00', '47', '1991-06-16 15:21:18', '1');
INSERT INTO `book` VALUES ('10', '238544', 'http://localhost:8091/static/images/czshuxue.jpg', '初中数学', '[3,6,8]', '小明', '贵州出版社', '初版', '2021-06-16 15:20:44', '英语听力简单易学', '72.00', '47', '1991-06-16 15:21:18', '1');
INSERT INTO `book` VALUES ('11', '338644', 'http://localhost:8091/static/images/chuzhonyingyu.jpg', '初中英语', '[3,6,8]', '小红', '贵州出版社', '初版', '2021-06-16 15:20:44', '英语听力简单易学', '46.00', '42', '1991-06-16 15:21:18', '1');

-- ----------------------------
-- Table structure for bookcomment
-- ----------------------------
DROP TABLE IF EXISTS `bookcomment`;
CREATE TABLE `bookcomment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookId` int(11) DEFAULT NULL,
  `comment` text,
  `commenrCreateDate` datetime DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `commentId` varchar(30) DEFAULT NULL,
  `commentLevel` tinyint(4) DEFAULT NULL COMMENT '评价级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookcomment
-- ----------------------------
INSERT INTO `bookcomment` VALUES ('1', '123456', '全书主要描写了孙悟空出世及大闹天宫后，遇见了唐僧、猪八戒、沙僧和白龙马，西行取经，一路上历经艰险、降妖伏魔，经历了九九八十一难，终于到达西天见到如来佛祖，最终五圣成真的故事。该小说以“唐僧取经”这一历史事件为蓝本，通过作者的艺术加工，深刻地描绘了明代社会现实。', '2021-06-10 14:21:00', '23231', 'ci123456777', '5');
INSERT INTO `bookcomment` VALUES ('2', '123456', '《西游记》自问世以来在民间广为流传，各式各样的版本层出不穷，明代刊本有六种，清代刊本、抄本也有七种，典籍所记已佚版本十三种。鸦片战争以后，大量中国古典文学作品被译为西文，《西游记》渐渐传入欧美，被译为英、法、德、意、西、手语、世（世界语）、斯（斯瓦西里语）、俄、捷、罗、波、日、朝、越等语言。', '2021-06-10 14:21:00', '23241', 'ci123456787', '4');
INSERT INTO `bookcomment` VALUES ('3', '123456', '托塔天王李靖及哪吒三太子奉旨兴师捉拿孙悟空，被孙悟空打败，回天庭复旨。太白金星奏请玉帝降旨封孙悟空为齐天大圣，但不给他事务与俸禄。玉帝准奏。孙悟空应太白金星之请，再入天宫。玉帝封其为齐天大圣，并赐齐天大圣府。孙悟空在天上无事，每日交朋结义，不论尊卑。', '2021-06-10 14:21:00', '23251', 'ci123456564', '4');
INSERT INTO `bookcomment` VALUES ('4', '123456', '吴承恩撰写的幽默小说《西游记》，里面写到儒、释、道三教，包含着深刻的内容，它是一部寓有反抗封建统治意义的神话作品。吴承恩本善于滑稽，他讲妖怪的喜怒哀乐都近于人情，所以人人都喜欢看。', '2021-06-10 16:02:16', '23231', 'ci162331213624700014', '5');
INSERT INTO `bookcomment` VALUES ('5', '123456', '西方人翻译了《西游记》，只认为是中国的神话故事，不晓得蕴含了印度、中国天人合一的宗教理念，里面还藏有深刻的道理。《西游记》我看过四五遍，前几年我还重新一字不漏再看一遍，我很想拿起笔来，每一句话、每一回都把它批了，那真是写得好，全部修道做工夫的道理都在内了。', '2021-06-10 16:03:12', '23231', 'ci162331219206300015', '4');
INSERT INTO `bookcomment` VALUES ('6', '123456', '《西游记》一书，自始至终，皆言诚意正心之要，明新至善之学，并无半字涉于仙佛邪淫之事。或问《西游记》果为何书？曰实是一部奇文、一部妙文。', '2021-06-10 16:03:51', '23231', 'ci162331223052000016', '4');
INSERT INTO `bookcomment` VALUES ('7', '123456', '《西游记》是一部以拯救堕落的人心与人精神为鹄的作品；《西游记》也是一部描写反贪题材的作品。', '2021-06-10 16:04:10', '23231', 'ci162331224997600017', '4');
INSERT INTO `bookcomment` VALUES ('8', '123456', '买了西游记和三国演义，家里之前也买过全套文言文的四大名著，但是因为语文老师推荐了这个版本的就又买了，希望改编版本孩子会更看得下去些。 两本书出版社不同，然后西游记封面的图案是模糊的。', '2021-06-10 16:07:36', '23231', 'ci162331245608300018', '0');
INSERT INTO `bookcomment` VALUES ('9', '123456', '给孩子买的，这次又买了好多。希望孩子的童年有书陪伴，远离电脑手机。经常在当当上给孩子买书，有的是孩子要求买的，有的是我在当当上看到的，评价好，内容觉得好的，买回来给孩子读。一直都很满意。特别是有活动的时候，能低到五折以下，总是买好多，特别划算。', '2021-06-10 16:08:14', '23231', 'ci162331249413800019', '4');
INSERT INTO `bookcomment` VALUES ('10', '123456', '给孩子读的书，语言精炼，通俗易懂，毕竟原版孩子还是没有这个理解能力，就算是这个版本对于孩子来说都需要经常停下来解释，所以读原著还是很有挑战性的。好评。', '2021-06-10 16:08:34', '23231', 'ci162331251437500020', '4');
INSERT INTO `bookcomment` VALUES ('11', '123456', '《西游记》讲述了唐僧、孙悟空、猪八戒和沙和尚师徒四人去西天取经的故事。昊最爱看的是孙悟空大闹天宫的故事。', '2021-06-10 16:08:48', '23231', 'ci162331252785400021', '3');
INSERT INTO `bookcomment` VALUES ('12', '123456', '为了凑单买的，还没看。之前买过彩绘少儿版西游记孩子很喜欢，希望这一版他也会爱看。可惜全书没有插画，要是适当的增加几幅插画就好了', '2021-06-10 16:08:58', '23231', 'ci162331253822000022', '4');
INSERT INTO `bookcomment` VALUES ('13', '123456', 'sdasdghsadsahgdyuasdjasdhsadsasssssssssssssssssssssssssssssssss', '2021-06-17 03:38:35', '23231', 'ci162387231546100012', '4');

-- ----------------------------
-- Table structure for border
-- ----------------------------
DROP TABLE IF EXISTS `border`;
CREATE TABLE `border` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderId` varchar(30) DEFAULT NULL,
  `orderState` tinyint(4) DEFAULT NULL COMMENT '1待付款2待发货3待收货4已完成5待评论6已取消',
  `payState` tinyint(4) DEFAULT NULL COMMENT '1已支付2未支付',
  `bookId` int(11) DEFAULT NULL,
  `orderCreateDate` datetime DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `shopCartId` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `amount` decimal(30,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=370 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of border
-- ----------------------------
INSERT INTO `border` VALUES ('352', 'oi162386858654900015', '1', '2', null, '2021-06-17 02:36:40', '23231', '[\"sc162304048031200012\",\"sc162304296934700013\"]', null, null);
INSERT INTO `border` VALUES ('353', 'oi162386871358000016', '1', '2', null, '2021-06-17 02:39:39', '23231', '[\"sc162304048031200012\",\"sc162304296934700013\"]', null, null);
INSERT INTO `border` VALUES ('354', 'oi162386879803900017', '4', '1', null, '2021-06-17 02:40:26', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('355', 'oi162386882634200018', '4', '1', null, '2021-06-17 02:40:37', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('356', 'oi162386883652300019', '4', '1', null, '2021-06-17 02:40:38', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('357', 'oi162386897326600020', '4', '1', null, '2021-06-17 02:44:40', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('358', 'oi162386909653400021', '4', '1', null, '2021-06-17 02:45:49', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('359', 'oi162386914913100022', '4', '1', null, '2021-06-17 02:45:50', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('360', 'oi162386929365900023', '4', '1', null, '2021-06-17 02:48:40', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('361', 'oi162386938740000024', '4', '1', null, '2021-06-17 02:50:00', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('362', 'oi162386947365400012', '4', '1', null, '2021-06-17 02:51:36', '23231', '1224577588,sc162304048031200012', null, null);
INSERT INTO `border` VALUES ('363', 'oi162386953763400013', '1', '2', null, '2021-06-17 02:52:21', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('364', 'oi162386963199000014', '4', '1', null, '2021-06-17 02:53:52', '23231', 'sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('365', 'oi162386964230700015', '1', '2', null, '2021-06-17 02:54:02', '23231', 'sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('366', 'oi162386965320200016', '1', '2', null, '2021-06-17 02:54:13', '23231', '1222254898,1224577588,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('367', 'oi162386966646800017', '1', '2', null, '2021-06-17 02:54:26', '23231', '1222218785,1222289565,1222254898,1224577588,sc162304048031200012,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('368', 'oi162386968062500018', '1', '2', null, '2021-06-17 02:54:41', '23231', '1222235656,1222256666,sc162304296934700013', null, null);
INSERT INTO `border` VALUES ('369', 'oi162391912625200016', '4', '1', null, '2021-06-17 16:38:46', '23231', 'sc162391908998600014,sc162391909484100015', null, null);

-- ----------------------------
-- Table structure for shopcart
-- ----------------------------
DROP TABLE IF EXISTS `shopcart`;
CREATE TABLE `shopcart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shopCartId` varchar(30) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `bookId` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `amount` decimal(30,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopcart
-- ----------------------------
INSERT INTO `shopcart` VALUES ('2', '1222226989', '2021-04-18 16:17:38', '23241', '654455', '20', '200.00');
INSERT INTO `shopcart` VALUES ('3', '569865564', '2021-02-14 16:17:38', '23261', '666661', '30', '300.00');
INSERT INTO `shopcart` VALUES ('4', '789556564', '2021-04-09 16:17:38', '23251', '879654', '40', '400.00');
INSERT INTO `shopcart` VALUES ('20', 'sc162391908055500013', '2021-06-17 16:38:01', '23231', '123456', '1', '50.00');
INSERT INTO `shopcart` VALUES ('21', 'sc162391908998600014', '2021-06-17 16:38:10', '23231', '666661', '1', '40.00');
INSERT INTO `shopcart` VALUES ('22', 'sc162391909484100015', '2021-06-17 16:38:15', '23231', '648792', '1', '70.00');

-- ----------------------------
-- Table structure for tbl_sys_disc
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sys_disc`;
CREATE TABLE `tbl_sys_disc` (
  `id` varchar(40) NOT NULL,
  `Create_time` datetime DEFAULT NULL,
  `Creator` varchar(30) DEFAULT NULL,
  `Update_time` datetime DEFAULT NULL,
  `Updator` varchar(30) DEFAULT NULL,
  `Disc_no` int(11) DEFAULT NULL COMMENT '字典编号',
  `Disc_name` varchar(255) DEFAULT NULL,
  `Item_no` int(11) DEFAULT NULL,
  `Item_name` varchar(255) DEFAULT NULL,
  `State` varchar(255) DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_sys_disc
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `sex` char(10) DEFAULT NULL COMMENT '1 男 2女',
  `birthday` datetime DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `userType` tinyint(4) DEFAULT NULL COMMENT '1游客2已注册',
  `banlance` double DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '23231', 'admin', '男', '2002-01-01 15:09:25', '15570994508', 'e10adc3949ba59abbe56e057f20f883e', '2021-05-26 16:52:04', '2', '7963');
INSERT INTO `user` VALUES ('2', '23241', '张三', '男', '2002-03-01 15:09:25', '17823152341', 'e10adc3949ba59abbe56e057f20f883e', '2021-06-03 16:52:04', '2', '1000');
INSERT INTO `user` VALUES ('3', '23251', '李四', '女', '2003-01-01 15:09:25', '12347895647', 'e10adc3949ba59abbe56e057f20f883e', '2021-04-01 16:52:04', '2', '1000');
INSERT INTO `user` VALUES ('4', '23261', '王五', '男', '2004-11-01 15:09:25', '14568974563', 'e10adc3949ba59abbe56e057f20f883e', '2021-03-12 16:52:04', '2', '1000');
INSERT INTO `user` VALUES ('5', '570270', 'ssdsada', null, null, null, '71b3b26aaa319e0cdf6fdb8429c112b0', '2021-06-16 21:57:59', '2', null);
INSERT INTO `user` VALUES ('6', '923711', 'dsd', null, null, null, 'b3957233dd5294cbf47d95fb3f584239', '2021-06-16 22:56:11', '2', null);
INSERT INTO `user` VALUES ('7', '454545', '556', '男', null, null, '456222', '2021-03-05 00:00:00', '2', null);
INSERT INTO `user` VALUES ('8', '954194', 'wew', null, null, null, 'e10adc3949ba59abbe56e057f20f883e', '2021-06-17 10:49:18', '2', '0');
INSERT INTO `user` VALUES ('9', '681141', 'sdads', null, null, '14457796554', 'e10adc3949ba59abbe56e057f20f883e', '2021-06-17 10:59:27', '2', '0');
INSERT INTO `user` VALUES ('10', '131914', 'sssddd', null, null, '14698743654', 'e10adc3949ba59abbe56e057f20f883e', '2021-06-17 11:16:23', '2', '0');
INSERT INTO `user` VALUES ('11', '823312', 'sdasd', null, null, '14563397852', 'e10adc3949ba59abbe56e057f20f883e', '2021-06-17 11:51:31', '2', '0');
INSERT INTO `user` VALUES ('12', '887264', 'sadas', null, null, '12455655585', 'e10adc3949ba59abbe56e057f20f883e', '2021-06-17 11:57:46', '2', '0');

-- ----------------------------
-- Table structure for user_address
-- ----------------------------
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addressid` varchar(40) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `province` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `detailAddress` varchar(100) DEFAULT NULL,
  `isDefaultAddress` int(11) DEFAULT '1' COMMENT '1不是2是',
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_address
-- ----------------------------
INSERT INTO `user_address` VALUES ('1', 'ua1623508976538001', '23231', '湖南省', '长沙市', '开福区', '长沙学院', '1', '2021-06-12 22:42:57');
INSERT INTO `user_address` VALUES ('2', 'ua1623509145304001', '23231', '湖南省', '长沙市', '望城区', '湖南信息职业技术学院', '1', '2021-06-12 22:45:45');
INSERT INTO `user_address` VALUES ('3', 'ua1623833432630001', '23231', '安徽省', '蚌埠市', '淮上区', 'xxxxxxx', '1', '2021-06-16 16:50:33');
INSERT INTO `user_address` VALUES ('4', 'ua1623850291191001', '23231', '安徽省', '蚌埠市', '淮上区', '解放路三号', '1', '2021-06-16 21:31:31');
INSERT INTO `user_address` VALUES ('5', 'ua1623919118720001', '23231', '安徽省', '蚌埠市', '淮上区', '14242424', '1', '2021-06-17 16:38:39');
