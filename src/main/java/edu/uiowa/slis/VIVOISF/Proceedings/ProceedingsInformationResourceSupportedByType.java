package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsInformationResourceSupportedByIterator theProceedingsInformationResourceSupportedByIterator = (ProceedingsInformationResourceSupportedByIterator)findAncestorWithClass(this, ProceedingsInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theProceedingsInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

