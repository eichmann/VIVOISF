package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumGoverningAuthorityForIterator theMuseumGoverningAuthorityForIterator = (MuseumGoverningAuthorityForIterator)findAncestorWithClass(this, MuseumGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theMuseumGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

