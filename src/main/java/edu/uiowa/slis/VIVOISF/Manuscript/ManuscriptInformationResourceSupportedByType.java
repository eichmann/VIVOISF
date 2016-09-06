package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptInformationResourceSupportedByIterator theManuscriptInformationResourceSupportedByIterator = (ManuscriptInformationResourceSupportedByIterator)findAncestorWithClass(this, ManuscriptInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theManuscriptInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

