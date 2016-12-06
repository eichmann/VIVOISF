package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNationalityARIterator theCollection = (CollectionNationalityARIterator)findAncestorWithClass(this, CollectionNationalityARIterator.class);
			pageContext.getOut().print(theCollection.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

