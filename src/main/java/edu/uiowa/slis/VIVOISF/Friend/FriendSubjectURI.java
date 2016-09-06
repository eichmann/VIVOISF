package edu.uiowa.slis.VIVOISF.Friend;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FriendSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FriendSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FriendSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Friend theFriend = (Friend)findAncestorWithClass(this, Friend.class);
			if (!theFriend.commitNeeded) {
				pageContext.getOut().print(theFriend.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Friend for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Friend for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Friend theFriend = (Friend)findAncestorWithClass(this, Friend.class);
			return theFriend.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Friend for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Friend for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Friend theFriend = (Friend)findAncestorWithClass(this, Friend.class);
			theFriend.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Friend for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Friend for subjectURI tag ");
		}
	}
}

