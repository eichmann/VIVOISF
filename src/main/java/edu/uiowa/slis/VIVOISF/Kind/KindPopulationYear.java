package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(KindPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindPopulationYearIterator theKind = (KindPopulationYearIterator)findAncestorWithClass(this, KindPopulationYearIterator.class);
			pageContext.getOut().print(theKind.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

