package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(KindInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindInformationResourceSupportedByIterator theKindInformationResourceSupportedByIterator = (KindInformationResourceSupportedByIterator)findAncestorWithClass(this, KindInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theKindInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

