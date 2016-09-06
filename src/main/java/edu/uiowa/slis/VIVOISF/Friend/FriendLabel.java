package edu.uiowa.slis.VIVOISF.Friend;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FriendLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FriendLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FriendLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Friend theFriend = (Friend)findAncestorWithClass(this, Friend.class);
			if (!theFriend.commitNeeded) {
				pageContext.getOut().print(theFriend.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Friend for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Friend for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Friend theFriend = (Friend)findAncestorWithClass(this, Friend.class);
			return theFriend.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Friend for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Friend for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Friend theFriend = (Friend)findAncestorWithClass(this, Friend.class);
			theFriend.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Friend for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Friend for label tag ");
		}
	}
}

