package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(groupAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupAgriculturalAreaUnitIterator thegroup = (groupAgriculturalAreaUnitIterator)findAncestorWithClass(this, groupAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thegroup.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing group for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

