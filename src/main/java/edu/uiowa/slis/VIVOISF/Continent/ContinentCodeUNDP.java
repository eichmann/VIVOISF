package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeUNDPIterator theContinent = (ContinentCodeUNDPIterator)findAncestorWithClass(this, ContinentCodeUNDPIterator.class);
			pageContext.getOut().print(theContinent.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

