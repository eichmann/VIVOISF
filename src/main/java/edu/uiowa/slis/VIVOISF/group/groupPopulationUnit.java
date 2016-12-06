package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(groupPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupPopulationUnitIterator thegroup = (groupPopulationUnitIterator)findAncestorWithClass(this, groupPopulationUnitIterator.class);
			pageContext.getOut().print(thegroup.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing group for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

