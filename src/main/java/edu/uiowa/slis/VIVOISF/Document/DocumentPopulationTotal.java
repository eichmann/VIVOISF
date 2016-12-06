package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPopulationTotalIterator theDocument = (DocumentPopulationTotalIterator)findAncestorWithClass(this, DocumentPopulationTotalIterator.class);
			pageContext.getOut().print(theDocument.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

