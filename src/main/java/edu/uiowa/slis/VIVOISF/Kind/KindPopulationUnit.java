package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(KindPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindPopulationUnitIterator theKind = (KindPopulationUnitIterator)findAncestorWithClass(this, KindPopulationUnitIterator.class);
			pageContext.getOut().print(theKind.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

