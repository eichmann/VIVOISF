package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNationalityFRIterator theCollection = (CollectionNationalityFRIterator)findAncestorWithClass(this, CollectionNationalityFRIterator.class);
			pageContext.getOut().print(theCollection.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

