package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyTranslatorOfIterator theGovernmentAgencyTranslatorOfIterator = (GovernmentAgencyTranslatorOfIterator)findAncestorWithClass(this, GovernmentAgencyTranslatorOfIterator.class);
			pageContext.getOut().print(theGovernmentAgencyTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

