package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(groupLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			if (!thegroup.commitNeeded) {
				pageContext.getOut().print(thegroup.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			return thegroup.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			thegroup.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for label tag ");
		}
	}
}

