package edu.uiowa.slis.VIVOISF.Nickname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NicknameLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NicknameLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NicknameLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nickname theNickname = (Nickname)findAncestorWithClass(this, Nickname.class);
			if (!theNickname.commitNeeded) {
				pageContext.getOut().print(theNickname.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Nickname theNickname = (Nickname)findAncestorWithClass(this, Nickname.class);
			return theNickname.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nickname for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Nickname theNickname = (Nickname)findAncestorWithClass(this, Nickname.class);
			theNickname.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Nickname for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nickname for label tag ");
		}
	}
}

