package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameOfficialFRIterator theCollection = (CollectionNameOfficialFRIterator)findAncestorWithClass(this, CollectionNameOfficialFRIterator.class);
			pageContext.getOut().print(theCollection.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

