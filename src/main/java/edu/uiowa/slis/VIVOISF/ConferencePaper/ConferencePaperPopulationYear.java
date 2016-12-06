package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPopulationYearIterator theConferencePaper = (ConferencePaperPopulationYearIterator)findAncestorWithClass(this, ConferencePaperPopulationYearIterator.class);
			pageContext.getOut().print(theConferencePaper.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

