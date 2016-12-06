package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			if (!thegroup.commitNeeded) {
				pageContext.getOut().print(thegroup.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing group for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			return thegroup.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing group for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			thegroup.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing group for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hideFromDisplay tag ");
		}
	}
}

