package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionPopulationUnitIterator theCollection = (CollectionPopulationUnitIterator)findAncestorWithClass(this, CollectionPopulationUnitIterator.class);
			pageContext.getOut().print(theCollection.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

