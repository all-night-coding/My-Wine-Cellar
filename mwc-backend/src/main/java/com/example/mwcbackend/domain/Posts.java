package com.example.mwcbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

import org.hibernate.type.StringNVarcharType;

import com.example.mwcbackend.oauth.BaseTimeEntity;
import com.example.mwcbackend.oauth.User;

@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Posts extends BaseTimeEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private Long postId = null;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "wine_id")
	private WineIcon wineIcon;

	@Column(nullable = false)
	private StringNVarcharType content;

	@Column(nullable = false)
	private String status;

	@Column(nullable = false)
	private StringNVarcharType follower;




}


