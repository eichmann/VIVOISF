package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPopulationYearIterator theConferencePoster = (ConferencePosterPopulationYearIterator)findAncestorWithClass(this, ConferencePosterPopulationYearIterator.class);
			pageContext.getOut().print(theConferencePoster.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

