package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentCites currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentCitesIterator thePatentCitesIterator = (PatentCitesIterator)findAncestorWithClass(this, PatentCitesIterator.class);
			pageContext.getOut().print(thePatentCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for cites tag ");
		}
		return SKIP_BODY;
	}
}

