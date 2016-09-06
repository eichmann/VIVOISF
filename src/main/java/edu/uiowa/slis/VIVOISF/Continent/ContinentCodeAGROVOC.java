package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeAGROVOCIterator theContinent = (ContinentCodeAGROVOCIterator)findAncestorWithClass(this, ContinentCodeAGROVOCIterator.class);
			pageContext.getOut().print(theContinent.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

