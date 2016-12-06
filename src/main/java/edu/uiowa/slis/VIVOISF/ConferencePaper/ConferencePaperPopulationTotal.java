package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPopulationTotalIterator theConferencePaper = (ConferencePaperPopulationTotalIterator)findAncestorWithClass(this, ConferencePaperPopulationTotalIterator.class);
			pageContext.getOut().print(theConferencePaper.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

