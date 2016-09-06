package edu.uiowa.slis.VIVOISF.Cell;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CellLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CellLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CellLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Cell theCell = (Cell)findAncestorWithClass(this, Cell.class);
			if (!theCell.commitNeeded) {
				pageContext.getOut().print(theCell.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Cell for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cell for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Cell theCell = (Cell)findAncestorWithClass(this, Cell.class);
			return theCell.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Cell for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cell for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Cell theCell = (Cell)findAncestorWithClass(this, Cell.class);
			theCell.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Cell for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cell for label tag ");
		}
	}
}

