package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionPopulationYearIterator theCollection = (CollectionPopulationYearIterator)findAncestorWithClass(this, CollectionPopulationYearIterator.class);
			pageContext.getOut().print(theCollection.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

