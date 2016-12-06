package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupPopulationUnitIterator thespecial_group = (special_groupPopulationUnitIterator)findAncestorWithClass(this, special_groupPopulationUnitIterator.class);
			pageContext.getOut().print(thespecial_group.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

