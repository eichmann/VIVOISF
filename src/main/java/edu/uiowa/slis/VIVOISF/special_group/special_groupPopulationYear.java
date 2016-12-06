package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupPopulationYearIterator thespecial_group = (special_groupPopulationYearIterator)findAncestorWithClass(this, special_groupPopulationYearIterator.class);
			pageContext.getOut().print(thespecial_group.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

