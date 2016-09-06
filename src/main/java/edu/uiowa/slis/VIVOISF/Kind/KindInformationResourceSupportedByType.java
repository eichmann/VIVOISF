package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindInformationResourceSupportedByIterator theKindInformationResourceSupportedByIterator = (KindInformationResourceSupportedByIterator)findAncestorWithClass(this, KindInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theKindInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

