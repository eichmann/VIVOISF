package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionAgriculturalAreaUnitIterator theCollection = (CollectionAgriculturalAreaUnitIterator)findAncestorWithClass(this, CollectionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theCollection.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

