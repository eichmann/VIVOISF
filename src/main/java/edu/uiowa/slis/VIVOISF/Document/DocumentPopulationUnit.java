package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPopulationUnitIterator theDocument = (DocumentPopulationUnitIterator)findAncestorWithClass(this, DocumentPopulationUnitIterator.class);
			pageContext.getOut().print(theDocument.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

