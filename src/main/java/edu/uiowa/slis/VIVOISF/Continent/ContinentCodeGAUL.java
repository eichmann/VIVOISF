package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeGAULIterator theContinent = (ContinentCodeGAULIterator)findAncestorWithClass(this, ContinentCodeGAULIterator.class);
			pageContext.getOut().print(theContinent.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

