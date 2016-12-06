package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPopulationTotalIterator theConferencePoster = (ConferencePosterPopulationTotalIterator)findAncestorWithClass(this, ConferencePosterPopulationTotalIterator.class);
			pageContext.getOut().print(theConferencePoster.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

