package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyFreetextKeywordIterator theGovernmentAgency = (GovernmentAgencyFreetextKeywordIterator)findAncestorWithClass(this, GovernmentAgencyFreetextKeywordIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

