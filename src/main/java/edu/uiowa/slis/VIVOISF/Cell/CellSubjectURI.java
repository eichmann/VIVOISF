package edu.uiowa.slis.VIVOISF.Cell;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CellSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CellSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CellSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cell theCell = (Cell)findAncestorWithClass(this, Cell.class);
			if (!theCell.commitNeeded) {
				pageContext.getOut().print(theCell.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cell for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cell for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Cell theCell = (Cell)findAncestorWithClass(this, Cell.class);
			return theCell.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cell for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cell for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Cell theCell = (Cell)findAncestorWithClass(this, Cell.class);
			theCell.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Cell for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cell for subjectURI tag ");
		}
	}
}

