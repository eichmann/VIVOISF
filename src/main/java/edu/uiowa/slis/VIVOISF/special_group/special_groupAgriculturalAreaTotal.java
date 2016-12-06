package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupAgriculturalAreaTotalIterator thespecial_group = (special_groupAgriculturalAreaTotalIterator)findAncestorWithClass(this, special_groupAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thespecial_group.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

