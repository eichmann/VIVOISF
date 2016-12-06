package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(KindPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindPopulationTotalIterator theKind = (KindPopulationTotalIterator)findAncestorWithClass(this, KindPopulationTotalIterator.class);
			pageContext.getOut().print(theKind.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

