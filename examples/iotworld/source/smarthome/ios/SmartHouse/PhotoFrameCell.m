//
//  PhotoFrameCell.m
//  SmartHouse
//
//  Created by Anton Bohomol on 4/28/15.
//  Copyright (c) 2015 CYBERVISION INC. All rights reserved.
//

#import "PhotoFrameCell.h"

@implementation PhotoFrameCell

- (void)awakeFromNib {
    self.thumbnail.layer.masksToBounds = YES;
    self.thumbnail.layer.borderColor = [UIColor whiteColor].CGColor;
    self.thumbnail.layer.borderWidth = 1;
}

@end