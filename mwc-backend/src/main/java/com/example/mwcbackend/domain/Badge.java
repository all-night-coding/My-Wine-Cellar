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
public class Badge extends BaseTimeEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "badge_id", nullable = false)
	private Long badgeId = null;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "badge_name")
	private String badgeName;

}
