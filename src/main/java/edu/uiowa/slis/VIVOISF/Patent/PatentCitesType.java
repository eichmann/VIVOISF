package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentCitesIterator thePatentCitesIterator = (PatentCitesIterator)findAncestorWithClass(this, PatentCitesIterator.class);
			pageContext.getOut().print(thePatentCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for cites tag ");
		}
		return SKIP_BODY;
	}
}

