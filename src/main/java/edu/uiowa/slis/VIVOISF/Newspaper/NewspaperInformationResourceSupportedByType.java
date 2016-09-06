package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperInformationResourceSupportedByIterator theNewspaperInformationResourceSupportedByIterator = (NewspaperInformationResourceSupportedByIterator)findAncestorWithClass(this, NewspaperInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theNewspaperInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

