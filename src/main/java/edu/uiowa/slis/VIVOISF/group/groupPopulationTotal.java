package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(groupPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupPopulationTotalIterator thegroup = (groupPopulationTotalIterator)findAncestorWithClass(this, groupPopulationTotalIterator.class);
			pageContext.getOut().print(thegroup.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing group for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

