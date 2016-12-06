package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupPopulationTotalIterator thespecial_group = (special_groupPopulationTotalIterator)findAncestorWithClass(this, special_groupPopulationTotalIterator.class);
			pageContext.getOut().print(thespecial_group.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

