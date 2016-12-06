package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(groupLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupLandAreaUnitIterator thegroup = (groupLandAreaUnitIterator)findAncestorWithClass(this, groupLandAreaUnitIterator.class);
			pageContext.getOut().print(thegroup.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing group for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

