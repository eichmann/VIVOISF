package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(groupAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			if (!thegroup.commitNeeded) {
				pageContext.getOut().print(thegroup.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing group for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			return thegroup.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing group for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			thegroup.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing group for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for abbreviation tag ");
		}
	}
}

