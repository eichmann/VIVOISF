package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPopulationUnitIterator theConferencePoster = (ConferencePosterPopulationUnitIterator)findAncestorWithClass(this, ConferencePosterPopulationUnitIterator.class);
			pageContext.getOut().print(theConferencePoster.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

