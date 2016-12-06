package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionPopulationTotalIterator theCollection = (CollectionPopulationTotalIterator)findAncestorWithClass(this, CollectionPopulationTotalIterator.class);
			pageContext.getOut().print(theCollection.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

