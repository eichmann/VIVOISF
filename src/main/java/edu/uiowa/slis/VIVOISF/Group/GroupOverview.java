package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			if (!theGroup.commitNeeded) {
				pageContext.getOut().print(theGroup.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Group for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			return theGroup.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Group for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			theGroup.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Group for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for overview tag ");
		}
	}
}

