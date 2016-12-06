package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionLandAreaUnitIterator theCollection = (CollectionLandAreaUnitIterator)findAncestorWithClass(this, CollectionLandAreaUnitIterator.class);
			pageContext.getOut().print(theCollection.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

