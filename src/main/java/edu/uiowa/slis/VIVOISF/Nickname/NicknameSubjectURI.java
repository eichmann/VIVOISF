package edu.uiowa.slis.VIVOISF.Nickname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NicknameSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NicknameSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NicknameSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nickname theNickname = (Nickname)findAncestorWithClass(this, Nickname.class);
			if (!theNickname.commitNeeded) {
				pageContext.getOut().print(theNickname.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Nickname theNickname = (Nickname)findAncestorWithClass(this, Nickname.class);
			return theNickname.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nickname for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Nickname theNickname = (Nickname)findAncestorWithClass(this, Nickname.class);
			theNickname.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for subjectURI tag ");
		}
	}
}

