package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPopulationUnitIterator theConferencePaper = (ConferencePaperPopulationUnitIterator)findAncestorWithClass(this, ConferencePaperPopulationUnitIterator.class);
			pageContext.getOut().print(theConferencePaper.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

